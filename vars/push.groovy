def call(String ){
echo 'This is pushing the image to dockerhub'
                withCredentials([usernamePassword(
                'credentialsId':"docker_hub_cred",
                passwordVariable:"dockerHubPass",
                usernameVariable:"dockerHubUser")]){
                sh"docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
                sh"docker tag my-notes:latest ${env.dockerHubUser}/my-notes:latest"
                sh"docker push ${env.dockerHubUser}/my-notes:latest"
}
