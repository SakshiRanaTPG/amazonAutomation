pipeline {
    agent any 
    stages {
        stage('Clean Repo') { 
            steps {
                bat "mvn clean" 
            }
        }
        stage('Test') { 
            steps {
                bat "mvn test"    //testing multibranch
            }
        }
        stage('Deploy') { 
            steps {
                bat "mvn package"
            }
        }
    }
}
