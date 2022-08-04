pipeline {
    agent any 
    stages {
        stage('Clone Repo') { 
            steps {
                bat "git clone https://github.com/SakshiRanaTPG/amazonAutomation.git" 
            }
        }
        stage('Test') { 
            steps {
                bat "mvn test -f amazonAutomation"
            }
        }
        stage('Deploy') { 
            steps {
                bat "mvn package -f amazonAutomation"
            }
        }
    }
}
