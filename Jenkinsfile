#!/usr/bin/env groovy

pipeline {
    agent any
    stages {
        stage('Checkout code') {
            steps {
	    	checkout scm
            }
        }
        stage ('Running tests') {
            steps {
                sh '''
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

