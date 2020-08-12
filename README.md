# springboot-aws-lambda-demo

AWS Lambda is a serverless computing service provided by Amazon to reduce the configuration of servers, OS AWS Lambda lets you run code without provisioning or managing servers—it scales automatically and only charges for the time your code is running

Dependency Required

org.springframework.cloud spring-cloud-function-adapter-aws com.amazonaws aws-lambda-java-events 2.0.2 com.amazonaws aws-lambda-java-core 1.1.0


Plugins (It will helps to downstream your jar size)

	<plugins>
		<plugin>
			<groupId>org.apache.maven.plugins</groupId>
			<artifactId>maven-deploy-plugin</artifactId>
			<configuration>
				<skip>true</skip>
			</configuration>
		</plugin>
		<plugin>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-maven-plugin</artifactId>
			<dependencies>
				<dependency>
					<groupId>org.springframework.boot.experimental</groupId>
					<artifactId>spring-boot-thin-layout</artifactId>
					<version>1.0.17.RELEASE</version>
				</dependency>
			</dependencies>
		</plugin>
		<plugin>
			<groupId>org.apache.maven.plugins</groupId>
			<artifactId>maven-shade-plugin</artifactId>
			<version>3.2.4</version>
			<configuration>
				<createDependencyReducedPom>false</createDependencyReducedPom>
				<shadedArtifactAttached>true</shadedArtifactAttached>
				<shadedClassifierName>aws</shadedClassifierName>
			</configuration>
		</plugin>
	</plugins>
