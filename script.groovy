def buildApp() {
    echo 'building the application...'
}

def testApp() {
    echo 'testing the application...'
}

def deployApp() {
    echo "Deploying the application..."
    echo "Deploying to ${params.VERSION}"
}
return this