package com.bjtu.cloud.microserviceprovideruser;

import org.apache.spark.ml.feature.VectorIndexer;
import org.apache.spark.ml.feature.VectorIndexerModel;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProviderUserApplicationTests {

	@Test
	public void contextLoads() {
		System.setProperty("hadoop.home.dir",
                "C:\\Users\\pipi\\Downloads\\hadoop-common-2.2.0-bin-master\\hadoop-common-2.2.0-bin-master");

		/*SparkSession spark = SparkSession.builder()
                .appName("Java Decition Tree Example")
                .master("local")
                .getOrCreate();
        Dataset<Row> data = spark.read().format("libsvm")
                .load("./mllib/sample_libsvm_data.txt");
        VectorIndexerModel featureIndexer = new VectorIndexer()
                .setInputCol("features")
                .setOutputCol("indexedFeatures")
                .setMaxCategories(4)
                .fit(data);*/

	}

}
