def call(String img, String ver){
echo 'This is pushing the image to dockerhub'
                withCredentials([usernamePassword('credentialsId':"docker_hub_cred",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
                sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
                sh "docker tag my-notes:latest ${dockerHubUser}/${img}:${ver}"
                sh "docker push ${dockerHubUser}/${img}:${ver}"
}
