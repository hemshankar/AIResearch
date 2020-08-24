1. Use tensorflow_BYOM_iris notebook example to create and deploy the model to the hosted endpoint.

2. Create EC2 instance

3. Install java and maven.

4. Copy the ‘sagemaker’ folder to one of the ec2 instance

5. Update the file ‘TestEndPointIris.java’ at line containing endpoint name to point to the created endpoint.

6. from sagemaker folder run 
	mvn clean install
	
This will send one request to the sagemaker and give back the response
