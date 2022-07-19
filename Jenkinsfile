//pipeline {
   // agent any

    //stages {
      //  stage('Build') {
        //    steps {
          //      echo 'Build App'
            //}
        }//
        //stage('Test') {
          //  steps {
            //    echo 'Test App'
            }//
        }//
        //stage('Deploy') {
          //  steps {
            //    echo 'Deploy App'
            }//
        }//

    }//
}//
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
