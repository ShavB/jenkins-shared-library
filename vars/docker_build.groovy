def call(String docker_image, String tag, String path) {
    sh "docker build -t ${docker_image}:${tag} ${path}"
}
