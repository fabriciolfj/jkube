eval $(minikube -p minikube docker-env)
./gradlew quarkusBuild k8sBuild

./gradlew k8sResource k8sApply