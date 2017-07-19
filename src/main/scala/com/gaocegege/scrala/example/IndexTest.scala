package com.gaocegege.scrala.example

import org.jsoup.nodes.Document
import java.net.URI
import collection.JavaConverters._

object IndexTest {
  def getContentPageUrls(indexPageDoc: Document, blockSelector: String, aTagFilter: String = "[target=_blank]"): Seq[URI] = {
    val targetNode = indexPageDoc.select(blockSelector)
    val aTagSelector = s"a$aTagFilter"
    val aTags = targetNode.select(aTagSelector)
    aTags.eachAttr("href").asScala.map(URI.create)
  }
}

/*
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import java.net.URI
import com.gaocegege.scrala.example.IndexTest._

val uri = "http://jjg.cq.gov.cn/gzdt/57/index.shtml"
val doc = Jsoup.connect(uri).get()
val urls = getContentPageUrls(doc, ".title")
 */