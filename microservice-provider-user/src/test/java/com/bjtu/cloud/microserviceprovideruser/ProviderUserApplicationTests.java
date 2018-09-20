package com.bjtu.cloud.microserviceprovideruser;

import org.apache.spark.ml.evaluation.RegressionEvaluator;
import org.apache.spark.ml.feature.VectorIndexer;
import org.apache.spark.ml.feature.VectorIndexerModel;
import org.apache.spark.ml.regression.DecisionTreeRegressionModel;
import org.apache.spark.ml.regression.DecisionTreeRegressor;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.apache.spark.sql.SparkSession;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProviderUserApplicationTests {

	public static void main(String[] args){
		System.setProperty("hadoop.home.dir",
                "D:\\hadoop-2.7.3");

		SparkSession spark = SparkSession.builder()
                .appName("Java Decition Tree Example")
                .master("local")
                .getOrCreate();
        Dataset<Row> data = spark.read().format("libsvm")
                .load("./mllib/sample_libsvm_data.txt");
       VectorIndexerModel featureIndexer = new VectorIndexer()
                .setInputCol("features")
                .setOutputCol("indexedFeatures")
                .setMaxCategories(4)
                .fit(data);

       Dataset<Row>[] splits = data.randomSplit(new double[]{0.7, 0.3});
       Dataset<Row> trainingData = splits[0];
       Dataset<Row> testData = splits[1];

       Dataset<Row> indexedTraingData = featureIndexer.transform(trainingData);
       Dataset<Row> indexedTestingData = featureIndexer.transform(testData);

       DecisionTreeRegressor dt = new DecisionTreeRegressor()
               .setFeaturesCol("indexedFeatures");

      DecisionTreeRegressionModel model =  dt.fit(indexedTraingData);

       Dataset<Row> predictions = model.transform(indexedTestingData);

       predictions.select("label", "features").show();

       RegressionEvaluator evaluator = new RegressionEvaluator()
               .setLabelCol("label")
               .setPredictionCol("prediction")
               .setMetricName("rmse");
       double rmse = evaluator.evaluate(predictions);
       System.out.println("Root Mean Squared Error (RMSE) on test data = " + rmse);
       System.out.println("Learned regression tree model:\n" + model.toDebugString());
	}

}
