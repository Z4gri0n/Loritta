package com.mrpowergamerbr.loritta.commands.vanilla.utils

import com.mrpowergamerbr.loritta.commands.AbstractCommand
import com.mrpowergamerbr.loritta.commands.CommandCategory
import com.mrpowergamerbr.loritta.commands.CommandContext
import com.mrpowergamerbr.loritta.utils.MiscUtils
import com.mrpowergamerbr.loritta.utils.locale.BaseLocale


class YoutubeMp3Command : AbstractCommand("ytmp3", listOf("youtube2mp3", "youtubemp3", "yt2mp3"), CommandCategory.UTILS) {
	override fun getUsage(): String {
		return "link"
	}

	override fun getDescription(locale: BaseLocale): String {
		return locale.get("YOUTUBEMP3_DESCRIPTION")
	}

	override fun getExample(): List<String> {
		return listOf("https://youtu.be/BaUwnmncsrc");
	}

	override fun run(context: CommandContext, locale: BaseLocale) {
		if (context.args.isNotEmpty()) {
			MiscUtils.sendYouTubeVideoMp3(context, context.args[0])
		} else {
			this.explain(context);
		}
	}
}