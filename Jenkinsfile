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
                    ./gradlew test
                '''
            }
        }
	post {
    	    success {
                setBuildStatus("Build succeeded", "SUCCESS");
    	    }
    	    failure {
                setBuildStatus("Build failed", "FAILURE");
    	    }
  	}
    }
}

