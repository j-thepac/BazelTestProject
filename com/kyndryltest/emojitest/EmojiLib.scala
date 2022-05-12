package com.kyndryltest.emojitest

import com.vdurmont.emoji.EmojiParser

class EmojiLib {
  def help() = println("An :grinning:awesome :smiley:string &#128516;with a few :wink:emojis!")

  def convert(s: String) = {
    val result = EmojiParser.parseToUnicode(s);
    println(result);
  }
}
