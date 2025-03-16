def call(String img, String ver, String username){
   echo 'Building the image'
   sh "docker build -t ${img}:${ver} . "
}
