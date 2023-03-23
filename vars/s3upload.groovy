def call(){
  echo "hello this is s3"
  sh 'aws s3 cp${WORKSPACE}/target/*.war s3://arts3up
}
