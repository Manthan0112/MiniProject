pipeline {
    environment {
        registry = "manthan0112/mini_project"
        registryCredential = 'dockerhub_id'
        dockerImage = ''
    }
    agent any

    stages {
        stage('Step 1: Git clone') {
            steps {
                git 'https://github.com/Manthan0112/MiniProject.git'
            }
        }
        stage('Step2 : Maven Build') {
            steps {
                sh 'mvn clean test'
            }
        }
        stage('Step3 : Maven install'){
            steps{
                sh 'mvn install'
            }
        }
        stage('Building our image') {
            steps{
                
                script {
                    dockerImage = docker.build registry
                }
            
                
            }
        }
        stage('Deploy our image') {
            steps{
                script {
                    docker.withRegistry( '', registryCredential ) {
                        dockerImage.push()  
                    }
                }
            }
        }
        stage('Cleaning up') {
            steps{
                sh "docker rmi $registry"
            }
        }
        stage('Ansible Deploy') {
            steps {
               
                ansiblePlaybook colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'p2.yml'

            }
        }
    }
}
