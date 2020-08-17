package ubot.common

import ktjsonrpcpeer.RpcChannel

interface UBotAppApi {
    suspend fun getGroupName(bot: String, id: String): String
    suspend fun getUserName(bot: String, id: String): String
    suspend fun sendChatMessage(bot: String, type: Int, source: String, target: String, message: String)
    suspend fun removeMember(bot: String, source: String, target: String)
    suspend fun shutupMember(bot: String, source: String, target: String, duration: Int)
    suspend fun shutupAllMember(bot: String, source: String, switch: Boolean)
    suspend fun getMemberName(bot: String, source: String, target: String): String
    suspend fun getUserAvatar(bot: String, id: String): String
    suspend fun getSelfID(bot: String): String

    companion object {
        fun of(rpc: RpcChannel): UBotAppApi {
            return UBotAppApiProxy(rpc)
        }
    }
}