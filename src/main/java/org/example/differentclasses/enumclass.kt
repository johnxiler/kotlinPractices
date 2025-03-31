package org.example.differentclasses

enum class NetworkStatus {
    SUCCESS, ERROR, LOADING
} 
//enum class defined the known constants

fun handleNetworkResponse(status: NetworkStatus) {
    when (status) {
        NetworkStatus.SUCCESS ->  println("Success...") //showSuccess()
        NetworkStatus.ERROR -> println("Error...") //showError()
        NetworkStatus.LOADING -> println("Loading....") //showLoading()
    }
}

fun main() {

    println("simulating network status")

    handleNetworkResponse(NetworkStatus.SUCCESS)
    handleNetworkResponse(NetworkStatus.ERROR)
    handleNetworkResponse(NetworkStatus.LOADING)

}
