def call(String img, String ver){
   echo 'Building the image'
   sh 'docker build -t ${img}:${ver} .' 
}
