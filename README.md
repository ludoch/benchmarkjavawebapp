benchmark-java-webapp
=====================

git clone https://github.com/ludoch/benchmarkjavawebapp.git

cd benchmarkjavawebapp

cd webfragment

mvn clean install

cd ../benchmark-java-webapp

mvn jetty:run

To deploy as a Managed App Engine Runtime:

mvn appengine:update

Access the main page at: http://http://jetty9-vm-annotations-perf-test.vmruntime-demo.appspot.com
