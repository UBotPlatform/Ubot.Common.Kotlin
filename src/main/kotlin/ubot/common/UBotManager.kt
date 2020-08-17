package ubot.common

import ktjsonrpcpeer.RpcChannel

interface UBotManager {
    suspend fun registerApp(id: String): String
    suspend fun registerAccount(id: String): String

    companion object {
        fun of(rpc: RpcChannel): UBotManager {
            return UBotManagerProxy(rpc)
        }
    }
}