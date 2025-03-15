def call(String url ,String branch){
  echo 'Git cloneing'
  git url: "${url}", branch: "${branch}"
  echo 'cloning successful'
}
