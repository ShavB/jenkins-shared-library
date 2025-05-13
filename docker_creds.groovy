def call(String project_name, String image_tag, String docker_user) {
    withCredentials([usernamePassword(
        'credentialsId': 'docker-hub-cred',
        passwordVariable: 'dockerHubPass',
        usernameVariable: 'dockerhubUser')
        ])
        {
        sh "docker login -u ${docker_user} -p ${dockerHubPass}"
        sh "docker image tag ${project_name}:${image_tag} ${docker_user}/${project_name}:${image_tag}"
        sh "docker push ${docker_user}/${project_name}:${image_tag}"
        }
}
