
pipeline {
    agent any 
    tools { maven 'Maven'}
    stages {
        stage ('Build Maven'){
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/emnakamm/JUNIT-JAVA.git']]])
               bat 'mvn clean install -DskipTests'
            }
        }
    }
}
