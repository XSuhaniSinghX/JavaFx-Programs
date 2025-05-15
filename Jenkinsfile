pipeline{
 agent {
  label 'windows'
        }
  stages {
    stage('maven install') {
      steps {
        withMaven(globalMavenSettingsConfig: '', jdk: '', maven: '', mavenSettingsConfig: '', traceability: true) {
          sh 'mvn clean install'
      }
    }
  }
  
   stage('Build docker image') {
    steps {
     script {
       sh 'docker build -t javafx-app:latest .'
     }
    }
   }
 }
}
