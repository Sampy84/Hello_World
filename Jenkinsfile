pipeline {

    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
		stage('Retrying') {
			steps {
				retry(3) {
					// Try to execute successfully the below command up to 3 times, otherwhise exit with error code.
					echo 'Retrying...'
				}
			}
		}
		stage('Waiting for a timeout') {
			steps {
				timeout(time: 1, unit: 'MINUTES') {
					// Waiting for finish up to 1 minute, otherwhise exit with error code.
					echo 'Waiting 1 minute...'
				}
			}
		}
    }
}
