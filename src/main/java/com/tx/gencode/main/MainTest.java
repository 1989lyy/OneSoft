package com.tx.gencode.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.apache.commons.lang3.StringUtils;

import com.tx.gencode.common.BeanService;
import com.tx.gencode.common.TemFactory;
import com.tx.gencode.domain.BeanModel;

import freemarker.template.Template;

public class MainTest {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		String[] table = { "BASEUSER" };
		BeanService bs =  (BeanService) com.tx.gencode.common.SpringContextUtil.getInstance().getBean("beanServiceImpl");
		for (int i = 0; i < table.length; i++) {
			if (StringUtils.isNotBlank(table[i])) {
				BeanModel bm = bs.getBeanModel(table[i]);
				bm.setMuKuai("project");
				// 实体类
				Template t = TemFactory.getTem("BeanModel.ftl");
				File file1 = TemFactory.createFile(bm, "domain_");
				FileOutputStream fos = new FileOutputStream(file1);
				Writer out = new OutputStreamWriter(fos);
				t.process(bm, out);
				out.flush();
				// dao
				t = TemFactory.getTem("DaoModel.ftl");
				file1 = TemFactory.createFile(bm, "dao_");
				fos = new FileOutputStream(file1);
				out = new OutputStreamWriter(fos);
				t.process(bm, out);
				out.flush();
				// mapper
				t = TemFactory.getTem("DaoMapperModel.ftl");
				file1 = TemFactory.createFile(bm, bm.getLeiName() + "Mapper");
				fos = new FileOutputStream(file1);
				out = new OutputStreamWriter(fos);
				t.process(bm, out);
				out.flush();
				// service
				t = TemFactory.getTem("ServiceModel.ftl");
				file1 = TemFactory.createFile(bm, "service_");
				fos = new FileOutputStream(file1);
				out = new OutputStreamWriter(fos);
				t.process(bm, out);
				out.flush();
				// serviceimpl
				t = TemFactory.getTem("ServiceImplModel.ftl");
				file1 = TemFactory.createFile(bm, "serviceImpl_");
				fos = new FileOutputStream(file1);
				out = new OutputStreamWriter(fos);
				t.process(bm, out);
				out.flush();
				// action
				t = TemFactory.getTem("ActionModel.ftl");
				file1 = TemFactory.createFile(bm, "action_");
				fos = new FileOutputStream(file1);
				out = new OutputStreamWriter(fos);
				t.process(bm, out);
				out.flush();
				// xml
				t = TemFactory.getTem("XmlModel.ftl");
				file1 = TemFactory.createFile(bm, "xml_");
				fos = new FileOutputStream(file1);
				out = new OutputStreamWriter(fos);
				t.process(bm, out);
				out.flush();
			}
		}

	}

}
