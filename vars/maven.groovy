def maveninstall() {
  stage('mvn-build'){
      sh 'mvn clean install'
  }
}
