pipeline {
    agent none
    stages {
        stage('build & Sonar Analysis') {
            steps{
                withSonarQubeEnv('sonar'){
                    sh 'mvn clean package sonar:sonar'
                }
            }
        }
    }
}