package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Creature;

@RestController //①WebAPI用のコントローラーにつけるアノテーション
public class humanJudgeController {
	
	@RequestMapping(value="/judge",method = {RequestMethod.POST})//②
	 //③judgeHumanメソッドについて
	 public List<Creature> judgeHuman(@RequestBody List<Creature> creature) {
	 
	 //判別結果を入れるリストを作成。
	 List<Creature> resultList = new ArrayList<Creature>();
	 
	 //人間かどうかを判定するプログラムを記述
	 for(int i = 0; i < creature.size(); ++i){
		 if (creature.get(i).getType().equals("human")) {
			 resultList.add(creature.get(i));
		 }
	 }
	 
	 return resultList;
	 }
	
	

}
