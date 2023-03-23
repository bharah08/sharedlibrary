def call(){
  echo "hello this build"
  sh 'mvn clean package'
}
