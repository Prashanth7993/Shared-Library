def call(String goals = 'clean install') {
  stage('mvn-build'){
      sh 'mvn ${goals}'
  }
}
