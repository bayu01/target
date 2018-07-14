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
                //sh 'readlink -e $(which java)'
		sh 'yum list'
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

