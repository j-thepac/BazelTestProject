package com.kyndryltest.emojitest

import com.vdurmont.emoji.EmojiParser

object EmojiTest extends App {

  val str = "An :grinning:awesome :smiley:string &#128516;with a few :wink:emojis!";
  val result = EmojiParser.parseToUnicode(str);

  println(result);
  // Prints:
  // "An 😀awesome 😃string 😄with a few 😉emojis!"
}
