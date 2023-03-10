pipeline {
    agent any
    triggers{
        // GitHub webhook will trigger pipeline
        githubPush()
    }

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "Maven"
    }

    stages {
        stage('Build') {
            steps {
                // Get code from a GitHub repository
                git 'https://github.com/L00162123ATU/lab3demo.git'

                // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

        }
        stage('Test') {
            when {
                // stage will execute only if current branch is main and 
                expression{
                    BRANCH_NAME == 'main' 
                }
            }
            steps {
                echo 'testing sample project'
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                junit '**/target/surefire-reports/TEST-*.xml'
                archiveArtifacts 'target/*.jar'
            }
        }
        stage('deploy') {
            steps {
                echo 'deploy sample project'
                sh 'make publish'
            
            }
        }
    }
}