def call() {
  stage('mvn-build'){
      sh 'mvn clean install'
  }
}
