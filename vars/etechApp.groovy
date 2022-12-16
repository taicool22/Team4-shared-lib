def call(string repoUrl){
   pipeline {
       agent any
       stages {
           stage("Tools initialization") {
               steps {
                   sh 'lscpu'
               }
           }
           stage("Checkout Code") {
               steps {
                   git branch: 'main',
                          url: "${repoUrl}"
               }
           }
           stage("to-test-maven") {
               steps {
                   sh 'df -h'
               }
           }
       }
} 
}
