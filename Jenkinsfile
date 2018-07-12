#!/usr/bin/env groovy

pipeline {
    agent any
    tools {
        jdk 'jdk8'
    }
    stages {
        stage('Checkout code') {
            steps {
	    	checkout scm
            }
        }
        stage ('Running tests') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    gradlew test
                '''
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}

