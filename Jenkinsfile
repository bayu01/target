#!/usr/bin/env groovy

pipeline {
    agent any
    stages {
        stage('Checkout code') {
            steps {
	    	checkout scm
            }
        }
	stage('Debugging') {
            steps {
                sh 'java -version'
            }
        }
        stage ('Running tests') {
            steps {
                sh '''
                    ./gradlew test
                '''
            }
        }
    }
}

