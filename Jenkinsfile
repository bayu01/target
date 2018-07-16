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
		sh 'ls /usr/lib/jvm/'
		sh 'ls /usr/lib/jvm/java-1.8.0-openjdk-1.8.0.171-8.b10.el7_5.x86_64/'
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

