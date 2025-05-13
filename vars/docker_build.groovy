def call(String docker_image, String tag) {
    sh "docker build -t ${docker_image}:${tag} ."
}
