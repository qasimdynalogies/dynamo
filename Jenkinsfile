pipeline {
    agent any
    stages {
        stage('Compile and Clean') {
            steps {

                sh "mvn clean compile"
            }
        }


        stage('deploy') {
            steps {
                sh "mvn package"
            }
        }


        stage('Build Docker image'){
            steps {

                sh 'docker build -t  qasimdynalogies/docker_jenkins_springboot:${BUILD_NUMBER} .'
            }
        }

        stage('Docker Login'){

            steps {
                 withCredentials([string(credentialsId: 'qasimdynalogies', variable: 'Dockerpwd')]) {
                    sh "docker login -u qasimdynalogies -p ${Dockerpwd}"
                }
            }
        }

        stage('Docker Push'){
            steps {
                sh 'docker push qasimdynalogies/docker_jenkins_springboot:${BUILD_NUMBER}'
            }
        }

        stage('Docker deploy'){
            steps {

                sh 'docker run -itd -p  8081:8080 qasimdynalogies/docker_jenkins_springboot:${BUILD_NUMBER}'
            }
        }


        stage('Archving') {
            steps {
                 archiveArtifacts '**/target/*.jar'
            }
        }
    }
}