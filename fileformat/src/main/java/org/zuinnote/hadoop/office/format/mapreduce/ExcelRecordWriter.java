/**
* Copyright 2016 ZuInnoTe (Jörn Franke) <zuinnote@gmail.com>
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
**/

package org.zuinnote.hadoop.office.format.mapreduce;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;

import java.security.GeneralSecurityException;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;


import org.apache.hadoop.conf.Configuration;

import org.zuinnote.hadoop.office.format.common.parser.FormatNotUnderstoodException;

import org.zuinnote.hadoop.office.format.common.writer.InvalidWriterConfigurationException;
import org.zuinnote.hadoop.office.format.common.writer.OfficeWriterException;
import org.zuinnote.hadoop.office.format.common.writer.InvalidCellSpecificationException;


/**
* This class writes Excel files in the old Excel format and in the new Excel format. 
*
*
**/

public class ExcelRecordWriter<NullWritable,SpreadSheetCellDAO>  extends AbstractSpreadSheetDocumentRecordWriter<NullWritable,SpreadSheetCellDAO>  implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 4172969599328960241L;
private static final Log LOGEW = LogFactory.getLog(ExcelRecordWriter.class.getName());

/*
* Non-arg constructor for Serialization
*
*/

public ExcelRecordWriter() {
	 // only for serialization
}

/*
* Instantiate the constructor of AbstractSpreadSheetDocumentRecordWriter
*
*/
public ExcelRecordWriter(DataOutputStream out, String fileName, Configuration conf) throws IOException, InvalidWriterConfigurationException, InvalidCellSpecificationException, FormatNotUnderstoodException, GeneralSecurityException, OfficeWriterException   {
	super(out,fileName,conf);
	LOGEW.debug("Initializing ExcelRecordWriter");
}


}
