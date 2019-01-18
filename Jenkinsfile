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
					// Repeat 3 times the entire pipeline
					echo 'Retrying...'
				}
			}
		}
		stage('Waiting for a timeout') {
			steps {
				timeout(time: 1, unit: 'MINUTES') {
					// Adding a timeout
					echo 'Waiting 1 minute...'
				}
			}
		}
    }
}
