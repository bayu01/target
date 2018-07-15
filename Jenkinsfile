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
                sh 'readlink -e $(which java)'
		//sh 'which java'
		//sh 'yum list installed'
		//sh 'rpm -ql which'
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

