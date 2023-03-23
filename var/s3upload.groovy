def call(){
  echo "hello this art will upload to s3"
  sh 'aws s3 cp${WORKSPACE}/target/*.war s3://arts3up
}
