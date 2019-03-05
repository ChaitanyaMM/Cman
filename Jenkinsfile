
pipeline {
  environment {
    registry = "https://hub.docker.com/chaitu465/openjdk"
    registryCredential = 'dockerhub'
  }
  agent any
  stages {
    stage('Cman') {
      steps{
        script {
         echo 'holla! cman is connected!'
        }
      }
    }
 
     stage('Building image') {
      steps{
        script {
          docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
   
  
  
  
}