package com.adp.cdg.graph

abstract class Visitor[V, E] {
  def visit(node: V, edge: (String, E), hops: Int): Unit
  def edges(node: V, hops: Int): Iterator[Relationship[V, E]]
}