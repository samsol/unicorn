/*******************************************************************************
 * (C) Copyright 2015 ADP, LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package unicorn

import unicorn.bigtable.{Column, Counter, RowScan, BigTable}
import unicorn.util._

/**
 * @author Haifeng Li
 */
package object index {
  type IndexableTable = BigTable with RowScan with Counter
  type RowMap = Map[String, collection.mutable.Map[ByteArray, Column]]

  private[index] val IndexMetaTableName = "unicorn.meta.index"
  private[index] val IndexMetaTableColumnFamily = "meta"

  private[index] val IndexColumnFamily = "index"
  private[index] val StatColumnFamily = "stat"
  private[index] val IndexColumnFamilies = Seq(IndexColumnFamily, StatColumnFamily)

  private[index] val IndexTableStatColumnCount: ByteArray = "count"

  private[index] val IndexDummyValue = Array[Byte](1)
  private[index] val UniqueIndexColumnQualifier = Array[Byte](1)
}