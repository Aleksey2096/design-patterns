package com.example.patterns.structural.composite.example2;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

public class ImageEditor {
	private EditorCanvas canvas;
	private CompoundShape allShapes = new CompoundShape();

	public ImageEditor() {
		canvas = new EditorCanvas();
	}

	public void loadShapes(Shape... shapes) {
		allShapes.clear();
		allShapes.add(shapes);
		canvas.refresh();
	}

	private class EditorCanvas extends Canvas {
		private JFrame frame;

		private static final int PADDING = 10;

		private EditorCanvas() {
			createFrame();
			refresh();
			addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					allShapes.unSelect();
					allShapes.selectChildAt(e.getX(), e.getY());
					e.getComponent().repaint();
				}
			});
		}

		@Override
		public int getWidth() {
			return allShapes.getX() + allShapes.getWidth() + PADDING;
		}

		@Override
		public int getHeight() {
			return allShapes.getY() + allShapes.getHeight() + PADDING;
		}

		@Override
		public void paint(Graphics graphics) {
			allShapes.paint(graphics);
		}

		private void createFrame() {
			frame = new JFrame();
			frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			frame.setLocationRelativeTo(null);

			JPanel contentPanel = new JPanel();
			Border padding = BorderFactory.createEmptyBorder(PADDING, PADDING, PADDING, PADDING);
			contentPanel.setBorder(padding);
			frame.setContentPane(contentPanel);

			frame.add(this);
			frame.setVisible(true);
			frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		}

		private void refresh() {
			this.setSize(getWidth(), getHeight());
			frame.pack();
		}
	}
}
