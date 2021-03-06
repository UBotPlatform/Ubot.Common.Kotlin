package ubot.common

open class BaseUBotApp : UBotApp {
    override suspend fun onReceiveChatMessage(
        bot: String,
        type: Int,
        source: String,
        sender: String,
        message: String,
        info: ChatMessageInfo
    ): UBotEventResult {
        return UBotEventResult.Ignore
    }

    override suspend fun onMemberJoined(bot: String, source: String, sender: String, inviter: String): UBotEventResult {
        return UBotEventResult.Ignore
    }

    override suspend fun onMemberLeft(bot: String, source: String, sender: String): UBotEventResult {
        return UBotEventResult.Ignore
    }

    override suspend fun processGroupInvitation(
        bot: String,
        sender: String,
        target: String,
        reason: String
    ): UBotEventResult {
        return UBotEventResult.Ignore
    }

    override suspend fun processFriendRequest(bot: String, sender: String, reason: String): UBotEventResult {
        return UBotEventResult.Ignore
    }

    override suspend fun processMembershipRequest(
        bot: String,
        source: String,
        sender: String,
        inviter: String,
        reason: String
    ): UBotEventResult {
        return UBotEventResult.Ignore
    }
}